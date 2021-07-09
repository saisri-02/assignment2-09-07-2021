import java.util.*;
class Swap
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows : ");
int r=sc.nextInt();
System.out.println("Enter number of columns : ");
int c=sc.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter elements in array a : ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
int b[][]=new int[r][c];
System.out.println("Enter elements in array b : ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
b[i][j]=sc.nextInt();
}
}
int temp[][]=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
temp[i][j]=a[i][j];
a[i][j]=b[i][j];
b[i][j]=temp[i][j];
}
}
System.out.println("Elements in array a : ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("Elements in array b : ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
}
}