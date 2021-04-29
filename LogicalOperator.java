class LogicalOperator{

public static void main(String[] args){

int p=10;
int q=20;
int s=10;

System.out.println(p==s && s<q);//true
System.out.println(p==q && s<q++);//false
System.out.println(q);//20
System.out.println(p==s || s<q);//true
System.out.println(p==q && s==q);//false

}
}


