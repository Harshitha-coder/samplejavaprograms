class UnaryPreIncrementOperator{

public static void main(String[] args){
 
int x=10;
int y=++x;
int z=++y;

System.out.println(++x);//12
System.out.println(y);//12
System.out.println(++z);//13
System.out.println(x+y+z);//37

}
}
