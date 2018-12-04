package im.status.keycard.globalplatform;

import im.status.keycard.applet.TinyBERTLV;

public class ApplicationID {
    public static final byte TLV_FILE_CONTROL_INFORMATION_TEMPLATE = (byte) 0x6F;
    public static final byte TLV_APPLICATION_AID = (byte) 0x84;

    private byte[] aid;

    public ApplicationID(byte[] tlvData) throws IllegalArgumentException {
        TinyBERTLV tlv = new TinyBERTLV(tlvData);
        tlv.enterConstructed(TLV_FILE_CONTROL_INFORMATION_TEMPLATE);
        this.aid = tlv.readPrimitive(TLV_APPLICATION_AID);
    }

    public byte[] getAID() {
        return aid;
    }
}
