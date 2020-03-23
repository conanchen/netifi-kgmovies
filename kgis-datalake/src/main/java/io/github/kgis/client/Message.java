// Generated from graphql_java_gen gem

package io.github.kgis.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* 【消息】由发送者发给一个或多个组织或个人的信息 A single message from a sender to one or more organizations or people.
*/
public class Message extends AbstractResponse<Message> implements Readable, Thing {
    public Message() {
    }

    public Message(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "hasReadNotes": {
                    List<ReadNote> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ReadNote> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ReadNote optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ReadNote(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "namespaces": {
                    List<Namespace> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Namespace> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new Namespace(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "identifier": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "alternateName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "isMessageOf": {
                    List<Conversation> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Conversation> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Conversation optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Conversation(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sender": {
                    responseData.put(key, new User(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "dateSent": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "toRecipient": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dateRead": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dateReceived": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "recipient": {
                    List<User> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<User> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            User optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new User(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "hasReviews": {
                    List<Review> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Review> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Review optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Review(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "Message";
    }

    /**
    * 
    */

    public List<ReadNote> getHasReadNotes() {
        return (List<ReadNote>) get("hasReadNotes");
    }

    public Message setHasReadNotes(List<ReadNote> arg) {
        optimisticData.put(getKey("hasReadNotes"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Namespace> getNamespaces() {
        return (List<Namespace>) get("namespaces");
    }

    public Message setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Message setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Message setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Message setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Message setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * 
    */

    public ID getId() {
        return (ID) get("id");
    }

    public Message setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    *     参照isPartOf【从属于】 是它的一部分 Indicates an item or CreativeWork that this item, or CreativeWork (in
    * some sense), is part of.    
    */

    public List<Conversation> getIsMessageOf() {
        return (List<Conversation>) get("isMessageOf");
    }

    public Message setIsMessageOf(List<Conversation> arg) {
        optimisticData.put(getKey("isMessageOf"), arg);
        return this;
    }

    /**
    *     【发送者】 参与者的子属性。例如邮件的发送者。 A sub property of participant. The participant who is at the sending end
    * of the action.    
    */

    public User getSender() {
        return (User) get("sender");
    }

    public Message setSender(User arg) {
        optimisticData.put(getKey("sender"), arg);
        return this;
    }

    /**
    *     【发送日期】 消息被发送的日期/时间。 The date/time at which the message was sent.    
    */

    public DateTime getDateSent() {
        return (DateTime) get("dateSent");
    }

    public Message setDateSent(DateTime arg) {
        optimisticData.put(getKey("dateSent"), arg);
        return this;
    }

    /**
    *     【收件人】 消息的直接收件人 A sub property of recipient. The recipient who was directly sent the message.    
    */

    public User getToRecipient() {
        return (User) get("toRecipient");
    }

    public Message setToRecipient(User arg) {
        optimisticData.put(getKey("toRecipient"), arg);
        return this;
    }

    /**
    *     【阅读日期】 如果存在单个的收件人，就是消息被收件人读取的日期/时间。 The date/time at which the message has been read by the
    * recipient if a single recipient exists.    
    */

    public DateTime getDateRead() {
        return (DateTime) get("dateRead");
    }

    public Message setDateRead(DateTime arg) {
        optimisticData.put(getKey("dateRead"), arg);
        return this;
    }

    /**
    *     【接收日期】 如果存在单个的收件人，就是消息被收件人接收的日期/时间。 The date/time the message was received if a single recipient
    * exists.    
    */

    public DateTime getDateReceived() {
        return (DateTime) get("dateReceived");
    }

    public Message setDateReceived(DateTime arg) {
        optimisticData.put(getKey("dateReceived"), arg);
        return this;
    }

    /**
    *     【接收者】 参与者的子属性。 在行动接收端的参与者。 A sub property of participant. The participant who is at the
    * receiving end of the action.    
    */

    public List<User> getRecipient() {
        return (List<User>) get("recipient");
    }

    public Message setRecipient(List<User> arg) {
        optimisticData.put(getKey("recipient"), arg);
        return this;
    }

    /**
    *     【评论】 评论，一般是用户对CreativeWork的评论。     
    */

    public List<Review> getHasReviews() {
        return (List<Review>) get("hasReviews");
    }

    public Message setHasReviews(List<Review> arg) {
        optimisticData.put(getKey("hasReviews"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "hasReadNotes": return true;

            case "namespaces": return true;

            case "identifier": return false;

            case "name": return false;

            case "alternateName": return false;

            case "description": return false;

            case "id": return false;

            case "isMessageOf": return true;

            case "sender": return true;

            case "dateSent": return false;

            case "toRecipient": return true;

            case "dateRead": return false;

            case "dateReceived": return false;

            case "recipient": return true;

            case "hasReviews": return true;

            default: return false;
        }
    }
}

