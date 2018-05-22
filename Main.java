package gorodilov;

public class Main {

    public static void main(String[] args)
    {
	    invertArray();  //вывод задания 1
        fillArray();    //вывод задания 2
        sixTwo();       //вывод задания 3
        fillDiagonal(); //вывод задания 4
        MinMaxArray();  //задание 6
        //moveArr();
    }

// задание 1

      public static void invertArray()
       {
        int[]  arr  = {0,  0,  1,  1,  0,  1, 0 } ;
          for ( int i  =  0; i  <  arr.length; i ++)
              {
                if (arr[i] == 0) arr[i]=1;
                else arr[i]=0;
                System.out.print(arr[i]);
              }
            System.out.println();
       }

//  задание 2

      public static void fillArray()
        {
          int a = 0;
          int[] arr = new int[8];
          for (int i = 0; i < arr.length; i++) {
              arr[i] = a;
              System.out.print(arr[i]);
              a = a + 3;

          }
            System.out.println();
        }

//  задание 3

    public static void sixTwo()
    {
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i=0; i<arr.length; i++)
           {
               if (arr[i] < 6) arr[i]=arr[i]*2;
               System.out.print(arr[i]);
           }
        System.out.println();
    }

//   задание 4

    public static void fillDiagonal()
    {
        int[][] arr = new int[4][4];

        for (int j = 0, a=3; j < 4; a--, j++)
          {
              for (int i = 0; i < 4; i++)
              {
                 if ((i==j)||(i==a))
                     {
                      arr[i][j] = 1;
                     }
                  System.out.print(arr[i][j]);
              }

              System.out.println();
          }


    }

//задание 5


    public static void MinMaxArray()
    {
       int[] arr = {-20,1,23,4,-111,56,430,32,-34,9,3};
       int a=0;
       int b=0;
            for (int i = 0; i<arr.length;i++)
             {
                 for (int i1 = 0; i1<arr.length;i1++)
                 {
                     if ((arr[i1]) < (arr[i]) & (arr[i1] < a))
                     {
                         a = arr[i1];
                     } else

                     if ((arr[i1]) > (arr[i]) & (arr[i1] > b))
                     {
                         b = arr[i1];
                     }
                 }
             }
             System.out.print("минимальный элемент =" + a);
             System.out.println();
             System.out.print("максимальный элемент =" + b);
             System.out.println();
    }


/* задание 6,7 не осилил

           public static void moveArr()
            {
               int[] arr = {1,2,3,4,5,6};
               int n = 2;
               int a = 0;

                for (int i = 0; i<arr.length;i++)
                 {
                    a = arr.length;
                     //System.out.print(a);
                 }


                for (int i = 0; i<a; i++)
                  {
                      if ((i + n) > a)
                        {
                           arr[i] = arr[i + n-a];
                        }
                       else  arr[i+n]=arr[i];

                       System.out.print(arr[i]);
                  }

            } */
}

