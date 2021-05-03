class BitwiseOperator{

public static void main(String[] args){

int i=10;
int j=20;
int k=30;

System.out.println( i==j & i++<k); //false
System.out.println( i);//11
System.out.println( i>++j | i<=k++);//true
System.out.println( j+k);//52

}
}


