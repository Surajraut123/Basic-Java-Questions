class A {
public void print() {
System.out.println("Class A");
}
}
class B extends A {
public void print() {
System.out.println("Class B");
super.print();
}
}