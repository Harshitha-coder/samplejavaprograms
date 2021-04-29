class UnaryDecrementOperator{

public static void main(String[] args){

int p=10;
int q=p--;
int s=--q;

System.out.println(p+q+s);//27
System.out.println(p--);//9
System.out.println(--s);//8
System.out.println(q);//9
System.out.println(--q);//8

}
}



