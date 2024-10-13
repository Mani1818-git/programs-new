 interface A{
  void a();
  void b();
  void c();
 void d();
 }
abstract class B implements A{
  public void c(){
  System.out.println("Iam c ");
 }
}
class M extends B{
 public void a(){
  System.out.println("Iam a");
 }
 public void b(){
 System.out.println("iam b");
 }
public void d(){
 System.out.println("I am d testing git");
 }
}
class ABC{
  public static void main(String args[]){
   A a1= new M();
     a1.a();
     a1.b();
     a1.c();
     a1.d();
   }
 }