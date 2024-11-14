class A
{
  void show()
  {
    System.out.println("class A show() method ");
  }
}
class B extends A
{
  void showb()
  {
    System.out.println("class B showb() method ");
  }
}
class Inheritance
{
  public static void main(String[] args)
  {
    B b=new B();
    b.show();
    b.showb();
  }
}
