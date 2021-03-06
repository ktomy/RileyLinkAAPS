package info.nightscout.androidaps.plugins.PumpOmnipod.comm.message;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import info.nightscout.androidaps.plugins.PumpOmnipod.comm.message.MessageBlockType;

public abstract class MessageBlock {
    protected byte[] encodedData = new byte[0];

    public MessageBlock(byte[] encodedData) {

    }
    public abstract MessageBlockType getType();

    //This method returns raw message representation
    //It should be rewritten in a derived class if raw representation of a concrete message
    //is something else than just message type concatenated with message data
    public byte[] getRawData() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try {
            stream.write(this.getType().getValue());
            stream.write((byte)encodedData.length);
            stream.write(encodedData);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return stream.toByteArray();
    }

    protected byte[] getByteArray(byte... input) {
        return input;
    }

}
