class Knapsack 
{
    static int max(int a, int b) 
{ return (a > b) ? a : b; }

    static int knapSack(int X, int XY[], int val[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][X + 1];
  
        for (i = 0; i<= n; i++) 
        {
            for (w = 0; w<= X; w++) 
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (XY[i - 1]<= w)
                    K[i][w] = max(val[i - 1] + K[i - 1][w - XY[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        return K[n][X];
    }
    public static void main(String args[])
    {
        int val[] = new int[] { 50, 200, 120 };
        int XY[] = new int[] { 40, 20, 50 };
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W, XY, val, n));
    }
}