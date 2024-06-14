package Java_04_StaticArray;

public class Arrayconcept {




		public static void main(String[] args) {
			int i =10;
			i=20;
			i=3;
			System.out.println(i);
			int array1[]=new int[4];
			array1[0]=10;
			array1[1]=20;
			array1[2]=30;
			array1[3]=40;
			//array1[4]=12;//Index 4 out of bounds for length 4
			//array1[-1]=4;//Index 4 out of bounds for length 4
			
			System.out.println("Lowest index:"+0);
			int l=array1.length;
			System.out.println("highest index:"+(l-1));
			System.out.println(array1.length);
			
			
			System.out.println(array1[1]);
			System.out.println(array1[3]);
			//System.out.println(array1[4]);//Index 4 out of bounds for length 4-Runtime exception
			//System.out.println(array1[-1]);//Index 4 out of bounds for length 4-Runtime exception.there is no negative indexing in java
			
			System.out.println(array1[0]+array1[3]);
		    //System.out.println(array1[4]);
			
			int price[]=new int[100];//100*4=400bytes allocated
			price[0]=10;
			price[1]=20;
			//actaul used 2*4=8 bytes
			//waste memory=400-8=392bytes
			System.out.println(price[1]);
			
			//To print all the values from array:for loop
			for(int k=0;k<array1.length;k++) {//complexity o(n)-----linear
				System.out.println("Array values are:"+array1[k]);
			}
			
			System.out.println("-----------For each loop--------");
			for(int e:array1) {//complexity o(n)-----linear. both are same performancewise only syntax is different
				System.out.println(e);
			}
			
			//2.double array:
			double d[]=new double[2];
			d[0]=4.6;
			d[1]=10; //it cantake int and doule as well it will treat as 10.00
			
			System.out.println("----------Double vallues---------");
			for(int j=0;j<d.length;j++)
			{
				System.out.println(d[j]);
			}
		
			for(double e:d) {
				System.out.println(e);
			}
			
			//3. char array
			char c[]=new char[1];
			
			//4. string array
			String names[]=new String[3];
			names[0]="savita";
			names[1]="sathe";
			names[2]="ganagaram";
			
			for(int n=0;n<names.length;n++)
			{
				System.out.println(names[n]);
			}
			
			for(String e:names) {//normal for loop pointing to the index thats why int and for each pointing to the data type thats why string
				System.out.println(e);
			}
			
			//5.If i want to print Emp Data: name(String),age(int),gender(char),salary(double),isPermanent(boolean)
			//we have to use: Object static array to store the different type data values
			//Object :is the parent class of all the classes in java.It can hold any type of data
			
			Object empData[]=new Object[5];
			empData[0]="savita";
			empData[1]=5;
			empData[2]='M';
			empData[3]=1.5;
			empData[4]=true;
			
			//To print all the empData values
			for(int o=0;o<empData.length;o++) {
				System.out.println(o+"="+empData[o]);//printing index as well
			}
			int count=0;
			for(Object e:empData) {
				
				System.out.println(count+"="+e);
				count++;
			}
			
			//static array Example2 : define the car properties
			 Object Car[]=new Object[5];
			 Car[0]="swift";
			 Car[1]="white";
			 Car[2]="4";
			 Car[3]=false;
			 Car[4]="Sedan";
			
		}

	}





	/*1.Static Array-Size/length of the array is fixed
	//2.Dynamic Array

	//drawback of static array 
	 a]size is fixed(staic): extra memory and less memory.
	 1.If we decalre the arraysize as 100 but we used only 5 then unnecessary memory leakage/wastage will happen
	 2.We declare the size 50 .If we have diwali seazon suddendly we got the requirements of 1oo products. we cant store 
	 the  100 products immediately we have shut down the appplication.make the changes then deploy the code and list the prodcuts.
	 So here the problem is ununecssary down time is there to aincrease the size of the array and add the more ane more products.
	 So this is the 2 limitation 1)Unnecessary memory allocation lead to application crash or performance issue 2)limited memory allocation
	 thays why we use Dynamic Arrays E.g: AllayList, 
	 b]Cannot store different types of data: Similar type of data is stored only
	 to overcome both the limitation we use Dynamic array->java collection->Arraylist

	 Q.Where we have to use static array?
	 =>Where the data is static there we can use static array E.g:1) Month ,Days 2)On eccommersce application categories are static
	 If we want to store Cricket info in that case use dynamic array.
	 */



