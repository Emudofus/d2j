package org.d2j.common.service.protocol.messages;

import org.apache.mina.core.buffer.IoBuffer;
import org.d2j.common.service.protocol.Message;
import org.d2j.common.service.protocol.MessageFactory;
import org.d2j.common.service.protocol.MessageMaker;

/**
 * User: Blackrush
 * Date: 31/10/11
 * Time: 10:50
 * IDE : IntelliJ IDEA
 */
public class ServiceInformationsRequestMessage extends Message {
    public static final int MESSAGE_ID = 7;

    @Override
    public int getMessageId() {
        return MESSAGE_ID;
    }

    @Override
    public void serialize(IoBuffer buffer) {

    }

    @Override
    public void deserialize(IoBuffer buffer) {

    }
}
