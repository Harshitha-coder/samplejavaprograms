class PrecedenceAndAssociativity{

public static void main(String[] args){

int x=100;
int y=200;
int z=300;

System.out.println( x>y++ && x<=z); //false
System.out.println( x>++y | y<=z++);//true
System.out.println( x+z++);//401

}
}


