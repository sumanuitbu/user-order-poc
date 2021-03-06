package com.telecom.user.dto;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telecom.user.dto.OrderError;
import com.telecom.user.dto.OrderStatus;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information related to an order
 */
@ApiModel(description = "Information related to an order")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-07-27T08:22:02.967Z")
@JsonInclude(Include.NON_NULL)
public class Order   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("offer_id")
  private String offerId = null;

  @JsonProperty("product_id")
  private String productId = null;

  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("creation_date")
  private Date creationDate = null;

  /**
   * type of the order
   */
  public enum TypeEnum {
    PURCHASE("purchase"),
    
    UNSUBSCRIPTION("unsubscription"),
    
    UPDATE("update");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("status")
  private OrderStatus status = null;

  @JsonProperty("error")
  private OrderError error = null;

  public Order id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique id of the order
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique id of the order")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Order offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Id of the purchased offer
   * @return offerId
  **/
  @ApiModelProperty(value = "Id of the purchased offer")


  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public Order productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Id of the subscribed product this order relates to
   * @return productId
  **/
  @ApiModelProperty(value = "Id of the subscribed product this order relates to")


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Order identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * user identifer (e.g. phone number) associated to the order
   * @return identifier
  **/
  @ApiModelProperty(value = "user identifer (e.g. phone number) associated to the order")


  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Order creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Time when the order was created, in ISO-8601 extended local date format. Time-offset from UTC may be used to match local OB time.
   * @return creationDate
  **/
  @ApiModelProperty(required = true, value = "Time when the order was created, in ISO-8601 extended local date format. Time-offset from UTC may be used to match local OB time.")
  @NotNull

  @Valid

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public Order type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * type of the order
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type of the order")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Order status(OrderStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public Order error(OrderError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OrderError getError() {
    return error;
  }

  public void setError(OrderError error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.offerId, order.offerId) &&
        Objects.equals(this.productId, order.productId) &&
        Objects.equals(this.identifier, order.identifier) &&
        Objects.equals(this.creationDate, order.creationDate) &&
        Objects.equals(this.type, order.type) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.error, order.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, offerId, productId, identifier, creationDate, type, status, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

