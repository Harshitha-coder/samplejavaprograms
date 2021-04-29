class UnaryPostIncrementOperator{

public static void main(String[] args){
 
int x=100;
int y=x++;
int z=y++;

System.out.println(x);//101
System.out.println(y++);//101
System.out.println(z++);//100
System.out.println(x+y+z);//304

}
}
