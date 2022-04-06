package com.homework.lambda_stream12;

public class Car {
  private String model;
  private boolean isElectric;

  public Car(String model, boolean isElectric) {
    this.model = model;
    this.isElectric = isElectric;
  }

  public String getModel() {
    return model;
  }

  public boolean isElectric() {
    return isElectric;
  }

  @Override
  public String toString() {
    return "Car " + model + ", electric - " + isElectric;
  }
}
