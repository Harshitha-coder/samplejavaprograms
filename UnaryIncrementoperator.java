class UnaryIncrementOperator{

public static void main(String[] args){
 int i=10;
 int j=20;
 int k=++i;
 j++;

System.out.println(j++);//21
System.out.println(i++);//11
System.out.println(++k);//12
System.out.println(i+j+k);//46

}

}