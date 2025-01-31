// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event_logging/v4/network_event_action_complex_type.proto

// Protobuf Java Version: 4.26.1
package uk.gov.gchq.event_logging.v4;

public interface NetworkEventActionComplexTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event_logging.v4.NetworkEventActionComplexType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The action of a server binding a network socket to a port and IP address.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType bind = 1 [json_name = "bind", (.buf.validate.field) = { ... }</code>
   * @return Whether the bind field is set.
   */
  boolean hasBind();
  /**
   * <pre>
   * The action of a server binding a network socket to a port and IP address.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType bind = 1 [json_name = "bind", (.buf.validate.field) = { ... }</code>
   * @return The bind.
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexType getBind();
  /**
   * <pre>
   * The action of a server binding a network socket to a port and IP address.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType bind = 1 [json_name = "bind", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexTypeOrBuilder getBindOrBuilder();

  /**
   * <pre>
   * The action of a client system establishing a connection with a server.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType connect = 2 [json_name = "connect", (.buf.validate.field) = { ... }</code>
   * @return Whether the connect field is set.
   */
  boolean hasConnect();
  /**
   * <pre>
   * The action of a client system establishing a connection with a server.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType connect = 2 [json_name = "connect", (.buf.validate.field) = { ... }</code>
   * @return The connect.
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexType getConnect();
  /**
   * <pre>
   * The action of a client system establishing a connection with a server.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType connect = 2 [json_name = "connect", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexTypeOrBuilder getConnectOrBuilder();

  /**
   * <pre>
   * The action of opening an unnamed socket that is bound to an address.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType open = 3 [json_name = "open", (.buf.validate.field) = { ... }</code>
   * @return Whether the open field is set.
   */
  boolean hasOpen();
  /**
   * <pre>
   * The action of opening an unnamed socket that is bound to an address.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType open = 3 [json_name = "open", (.buf.validate.field) = { ... }</code>
   * @return The open.
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexType getOpen();
  /**
   * <pre>
   * The action of opening an unnamed socket that is bound to an address.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType open = 3 [json_name = "open", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexTypeOrBuilder getOpenOrBuilder();

  /**
   * <pre>
   * The action of closing an open socket or connection.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType close = 4 [json_name = "close", (.buf.validate.field) = { ... }</code>
   * @return Whether the close field is set.
   */
  boolean hasClose();
  /**
   * <pre>
   * The action of closing an open socket or connection.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType close = 4 [json_name = "close", (.buf.validate.field) = { ... }</code>
   * @return The close.
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexType getClose();
  /**
   * <pre>
   * The action of closing an open socket or connection.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType close = 4 [json_name = "close", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexTypeOrBuilder getCloseOrBuilder();

  /**
   * <pre>
   * The action of sending data on a socket.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType send = 5 [json_name = "send", (.buf.validate.field) = { ... }</code>
   * @return Whether the send field is set.
   */
  boolean hasSend();
  /**
   * <pre>
   * The action of sending data on a socket.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType send = 5 [json_name = "send", (.buf.validate.field) = { ... }</code>
   * @return The send.
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexType getSend();
  /**
   * <pre>
   * The action of sending data on a socket.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType send = 5 [json_name = "send", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexTypeOrBuilder getSendOrBuilder();

  /**
   * <pre>
   * The action of receiving data on a socket.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType receive = 6 [json_name = "receive", (.buf.validate.field) = { ... }</code>
   * @return Whether the receive field is set.
   */
  boolean hasReceive();
  /**
   * <pre>
   * The action of receiving data on a socket.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType receive = 6 [json_name = "receive", (.buf.validate.field) = { ... }</code>
   * @return The receive.
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexType getReceive();
  /**
   * <pre>
   * The action of receiving data on a socket.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType receive = 6 [json_name = "receive", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexTypeOrBuilder getReceiveOrBuilder();

  /**
   * <pre>
   * The action of making a socket listen for connections.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType listen = 7 [json_name = "listen", (.buf.validate.field) = { ... }</code>
   * @return Whether the listen field is set.
   */
  boolean hasListen();
  /**
   * <pre>
   * The action of making a socket listen for connections.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType listen = 7 [json_name = "listen", (.buf.validate.field) = { ... }</code>
   * @return The listen.
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexType getListen();
  /**
   * <pre>
   * The action of making a socket listen for connections.
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType listen = 7 [json_name = "listen", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexTypeOrBuilder getListenOrBuilder();

  /**
   * <pre>
   * The action of network traffic being permitted by an Access Control List (ACL).
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType permit = 8 [json_name = "permit", (.buf.validate.field) = { ... }</code>
   * @return Whether the permit field is set.
   */
  boolean hasPermit();
  /**
   * <pre>
   * The action of network traffic being permitted by an Access Control List (ACL).
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType permit = 8 [json_name = "permit", (.buf.validate.field) = { ... }</code>
   * @return The permit.
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexType getPermit();
  /**
   * <pre>
   * The action of network traffic being permitted by an Access Control List (ACL).
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType permit = 8 [json_name = "permit", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexTypeOrBuilder getPermitOrBuilder();

  /**
   * <pre>
   * The action of network traffic being denied by an Access Control List (ACL).
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType deny = 9 [json_name = "deny", (.buf.validate.field) = { ... }</code>
   * @return Whether the deny field is set.
   */
  boolean hasDeny();
  /**
   * <pre>
   * The action of network traffic being denied by an Access Control List (ACL).
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType deny = 9 [json_name = "deny", (.buf.validate.field) = { ... }</code>
   * @return The deny.
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexType getDeny();
  /**
   * <pre>
   * The action of network traffic being denied by an Access Control List (ACL).
   * </pre>
   *
   * <code>.event_logging.v4.NetworkOutcomeComplexType deny = 9 [json_name = "deny", (.buf.validate.field) = { ... }</code>
   */
  uk.gov.gchq.event_logging.v4.NetworkOutcomeComplexTypeOrBuilder getDenyOrBuilder();
}
