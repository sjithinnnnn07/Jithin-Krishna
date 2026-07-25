class Main{
public static void main(String[] args){
    String[] name={"ajith","vijay","abi","akash"};
    int[][] mark={{60,76,98,75,59},{69,54,78,69,63},{85,96,85,76,91},{78,55,75,84,96}};
    for(int i=0;i<name.length;i++)
    {
        System.out.println("name="+name[i]);
        double total=0;
        for(int j=0;j<mark[i].length;j++)
        {
            System.out.println(mark[i][j]+"");
            total+=mark[i][j];
        }
        System.out.println();
        System.out.println("average"+(total/5)+"%");
        System.out.println();
    }
}
