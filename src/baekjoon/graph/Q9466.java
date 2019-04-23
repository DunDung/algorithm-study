package baekjoon.graph;


import java.util.Arrays;
import java.util.Scanner;

//텀 프로젝트
//이해하기 어려운문제..
//X
public class Q9466 {
	static int a[]; //입력받는 배열
    static int check[]; //방문 check(시작에서부터 몇번째로 방문되는 것인지)
    static int startVertex[];   //시작정점
     
    static int dfs(int i, int cnt, int start){
        
        if(check[i]!=0){ //이미 방문했던 정점이라면
            if(start!=startVertex[i]) //시작 정점과 같지 않다면
                return 0;   			//0리턴
            return cnt-check[i]; //몇번째 방문한 정점인지 리턴..
        }
         
        check[i]=cnt; //몇번째 방문한건지 저장 
        startVertex[i]=start; 
        return dfs(a[i],cnt+1, start); //가리키는 정점, +1번째 방문, start그대로 
    }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
         
        while(t-- > 0)
        {
            int n=sc.nextInt();
            a=new int[n+1];
            check=new int[n+1];
            startVertex=new int[n+1];
             
            for(int i=1;i<=n;i++)
                a[i]=sc.nextInt();
             
            int ans=0;
            for(int i=1;i<=n;i++){
                if(check[i]==0)
                    ans+=dfs(i,1,i);
            }
            System.out.println(Arrays.toString(check));
            System.out.println(Arrays.toString(startVertex));
            System.out.println(n-ans);
         
        }
    }
}


