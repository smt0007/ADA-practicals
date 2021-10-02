public class BubbleSort
{
    void bubblesort(int array[])
    {
        int n = array.length;
        for(int step = 0; step < n - 1; ++step)
        {
            for(int i = 0; i <n - step - 1 ; ++i)
            {
                if(array[i] > array[i + 1])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
    void printarray(int array[])
    {
        int n = array.length;
        for(int i = 0; i < n; ++i)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        BubbleSort ob  = new BubbleSort();
        int data[] = {-5, 23, 54, 0 , 32};
        ob.bubblesort(data);
        System.out.println("sorted array");
        ob.printarray(data);
    }
}