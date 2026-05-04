package com.bank.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Kiểm thử lớp Customer.
 */
public class CustomerTest {

  @Test
  public void testGetCustomerInfo() {
    Customer customer = new Customer(123456789L, "Nguyen Van A");

    assertEquals(
        "Số CMND: 123456789. Họ tên: Nguyen Van A.",
        customer.getCustomerInfo());
  }

  @Test
  public void testLogging() {
    CheckingAccount acc = new CheckingAccount(123456789L, 10000);

    acc.deposit(500);
    acc.withdraw(200);

    // kiểm tra logic luôn
    assertEquals(10300, acc.getBalance(), 0.001);
  }
}