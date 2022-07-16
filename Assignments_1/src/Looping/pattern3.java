package Looping;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  **********
       // *********
       //********
      //*******
     //******
    //*****
   //****
  //***
 //**
//*

		int n=10;
		
		for(int i=1;i<=n;i++)
		{
			for(int k=n-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
