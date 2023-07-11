package com.practice;

abstract class PC
{
abstract void insertToPort();
}
class PenDrive extends PC
{
@Override
void insertToPort() {
System.out.println("Data can be copied or retrieved from the system");
}
}
class Mouse extends PC {
@Override
void insertToPort() {
System.out.println("Mouse can be connected to the system through USB port");
}
}
class USBPort {
static void insertDevice(PC ref) {
ref.insertToPort();
}
}
public class TestUSBPort {
public static void main(String[] args) {
Mouse m1 = new Mouse();
PenDrive pd1 = new PenDrive();
USBPort.insertDevice(pd1);
}
}