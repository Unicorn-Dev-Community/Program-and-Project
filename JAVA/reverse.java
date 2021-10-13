class reverse{
  public static void main(String[] args){
    int n = 7368;
    //int l = math.log(n)+1;
    int ans=0,a=0;
    while(n>0){
        a=n%10;
        ans=ans*10+a;
        n/=10;
    }
    System.out.println(ans);
  }
}
