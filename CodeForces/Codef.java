import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Codef {
    public static void main(String args[]){
        //  BLACK SQUARE
        // Scanner sc = new Scanner(System.in);
        // HashMap<Character,Integer> hm = new HashMap<>();
        // hm.put('1',sc.nextInt());
        // hm.put('2',sc.nextInt());
        // hm.put('3',sc.nextInt());
        // hm.put('4',sc.nextInt());
        // String s = sc.next();
        // int count =0;
        // char[] arr = s.toCharArray();
        // for(char c : arr){
        //     count+= hm.get(c);
        // }
        // System.out.println(count);

        // Greg's WORKOUT

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int chest = 0;int bi =0 ;int back =0;
        // int arr [] = new int[n];
        // for (int i = 0; i < n; i++) {
        //     int exercise = sc.nextInt();
        //     if (i % 3 == 0) {
        //         chest += exercise;
        //     } else if (i % 3 == 1) {
        //         bi += exercise;
        //     } else {
        //         back += exercise;
        //     }
        // }
        
        // if (chest > bi && chest > back) {
        //     System.out.println("chest");
        // } else if (bi > chest && bi > back) {
        //     System.out.println("biceps");
        // } else {
        //     System.out.println("back");
        // }
        

        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // String t = sc.next();
        // StringBuilder sb = new StringBuilder();
        // String s1 [] = s.split(":");
        // String s2 [] = s.split(":");
        // for(int i=0;i<s.length();i++){
        //     int ans1= Integer.parseInt(s1[i]);
        //     int ans2 = Integer.parseInt(s2[i]);
        //     if(ans1>ans2){
        //         int ans01 = ans1-ans2;
        //     }
        //     else{
        //         int ans01 = 24 - ans2;
        //     }
        // }
        // System.out.println(ans01+":"+ans01);

        //ARRIVAL OF THE GENERAL

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // int count=0;
        // for(int i=0;i<n;i++){
        //     arr[i]+=sc.nextInt();
        // }
        // int first = arr[0];
        // System.out.println(first);
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>first){

        //     }
        // }

        // CHEWBACCA AND NUMBER

        // Scanner sc = new Scanner(System.in);
        // String x = sc.next();

        // StringBuilder sb = new StringBuilder();

        // int firstDigit = x.charAt(0) - '0';
        // if (firstDigit != 9) {
        //     sb.append(Math.min(firstDigit, 9 - firstDigit));
        // } else {
        //     sb.append(firstDigit);
        // }
        // for (int i = 1; i < x.length(); i++) {
        //     int digit = x.charAt(i) - '0';
        //     sb.append(Math.min(digit, 9 - digit));
        // }

        // System.out.println(sb.toString());


        // CUPBOARDS

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int count0c1=0;int count0c2=0;
        // int count1c1=0;int count1c2=0;
        // int [][] arr = new int[n][2];
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         arr[i][j]+=sc.nextInt();
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i][0]==0){
        //         count0c1++;
        //     }else{
        //         count0c2++;
        //     }
        //     if(arr[i][1]==0){
        //         count1c1++;
        //     }else{
        //         count1c2++;
        //     }
        // }
        // int ans = (n-Math.max(count0c1,count0c2)+n-Math.max(count1c1,count1c2));
        // System.out.println(ans);

        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        // int amazing =0 ;

        // Scanner sc = new Scanner(System.in);
        // HashMap<Character,Integer> hm1 = new HashMap<>();
        // HashMap<Character,Integer> hm2 = new HashMap<>();
        // char [] s1 = sc.nextLine().toCharArray(); 
        // char [] s2 = sc.nextLine().toCharArray(); 
        // char [] s3 = sc.nextLine().toCharArray(); 

        // for(char c: s1 ){
        //     hm1.put(c,hm1.getOrDefault(c, 0)+1);
        // }
        // for(char c: s2 ){
        //     hm1.put(c,hm1.getOrDefault(c, 0)+1);
        // }
        // for(char c: s3 ){
        //     hm2.put(c,hm2.getOrDefault(c, 0)+1);
        // }
        // for(int i=0;i<hm1.size();i++){
        //     if(hm2.containsKey(hm1.get(i))){
        //         System.out.println("YES");
        //     }else{
        //         System.out.println("NO");
        //     }
        // }

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int j = 0; j < n; j++) {
        //     int r = sc.nextInt(); 
        //     String s = sc.next();
        //     int Sindex = 0;
        //     int Lindex = 0;
        //     for(int i = 0; i < s.length(); i++) {
        //         if(s.charAt(i) == 'B') {
        //             Sindex = i;
        //             break;
        //         }
        //     }
        //     for(int i = s.length() - 1; i > 0; i--) {
        //         if(s.charAt(i) == 'B') {
        //             Lindex = i;
        //             break;
        //         }
        //     }   
        //     System.out.println((Lindex - Sindex) + 1);
        // }

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=0;i<n;i++){
        //     int t = sc.nextInt();
        //     String s ="abcdefghijklmnoprstuvwxyz";
        //     String s1 = s.substring(0,t);
        //     StringBuilder sb = new StringBuilder();
        //     int arr[] = new int[t];
        //     for(int j=0;j<t;j++){
        //         s+="a";
                
        //         arr[j]+=sc.nextInt();
        //         int max = arr[j];
        //         if(arr[j]==0){
        //             sb.append(s.charAt(j));
                  
        //         }else if(arr[j]>=max) {
        //             sb.append(s.charAt(j+1));
        //             // for(int r=0;r<s1.length();r++){
                        
        //             // }
                    
        //         }else {
        //             sb.append(s.charAt(0));
        //         }
                
        //     }
        //     System.out.println(sb);

        // }
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt(); 
        // for(int p = 0; p < t; p++) {
        //     int n = sc.nextInt(); 
        //     int m = sc.nextInt(); 
        //     int k = sc.nextInt(); 
            
        //     HashSet<Integer> setA = new HashSet<>();
        //     HashSet<Integer> setB = new HashSet<>();
        //     int count=0;
        //     int count1=0;
        //     for(int i = 0; i < n; i++) {
        //         setA.add(sc.nextInt());
        //     }
            
        //     for(int i = 0; i < m; i++) {
        //         setB.add(sc.nextInt());
        //     }
            
        //     for(int i = 1; i <= k; i++) {
        //         if(setA.contains(i)) {
        //             count++;
        //             setB.remove(i);
        //             if(count==k/2){
        //                 break;
        //             }
        //         }
        //     }
        //     for(int i=0;i<=k;i++){
        //         if(setB.contains(i)){
        //             count1++;
        //         }
        //     }
        //     count1=0;
        //     if (count == k/2 && count1 == k/2) {
        //         System.out.println("YES");
        //     } else {
        //         System.out.println("NO");
        //     }
            
        // }

        // Scanner sc =  new Scanner(System.in);
        // int t = sc.nextInt();
        // for(int i=0;i<t;i++){
        //     int n = sc.nextInt();
        //     if(n<3){
        //         System.out.println(0);
        //     }
        //     else{
        //         int ans = (n % 2 == 0) ? (n - 2) / 2 : (n - 1) / 2;
        //         System.out.println(ans);
            
        //     }

        // }

        // Scanner sc = new Scanner(System.in);
        // String s1 = sc.nextLine();
        // String s2 = sc.nextLine();
        // String s3 = sc.nextLine();
        // char [] arr = s1.toCharArray();
        // char [] arr1 = s2.toCharArray();
        // char [] arr2 = s3.toCharArray();
        // boolean yes = true;
        // for (int i = 0; i < arr1.length; i++) {
        //     if (arr[i] != arr2[i] && arr1[i] != arr2[i]) {
        //         yes = false;
        //         break;
        //     }
        // }
        
        // System.out.println(yes ? "YES" : "NO");

        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // if(s.contains("H")||s.contains("Q")||s.contains("9")){
        //     System.out.println("YES");
        // }else{
        //     System.out.println("NO");
        // }

        // Scanner sc = new Scanner(System.in);
        // int t=sc.nextInt();
        // String num="";
        // for(int i=0;i<t;i++){
        //     num += sc.nextInt();
        // }
        // Integer nums = Integer.valueOf(num);
        // if(nums%10==0){
        //     if()
        // }
        // for(int i=0;i<t;i++){
        //     int ld = nums%10;
        //     if(ld==0){

        //     }
        // }

        //LIGHTS OUT

        // Scanner sc = new Scanner(System.in);
        // int pressed[][] = new int[5][5];
        // int toggled[][] = new int[5][5];
        // for(int i=1;i<=3;i++){
        //     for(int j=1;j<=3;j++){
        //         pressed[i][j]=sc.nextInt();
        //         toggled[i][j] = pressed[i][j];
        //     }
        // }
        // for(int i=1;i<=3;i++){
        //     for(int j=1;j<=3;j++){
        //         if(pressed[i][j]!=0){
        //             toggled[i][j-1]+=pressed[i][j];
        //             toggled[i][j+1]+=pressed[i][j];
        //             toggled[i-1][j]+=pressed[i][j];
        //             toggled[i+1][j]+=pressed[i][j];
        //         }
        //     }
        // }
        // for(int i=1;i<=3;i++){
        //     for(int j=1;j<=3;j++){
        //         if(toggled[i][j]%2==0){
        //             System.out.print(1);
        //         }else{
        //             System.out.print(0);
        //         }
        //     }
        //     System.out.println();
        // }

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // int min = Integer.MAX_VALUE; int maxi =0;
        // int max = Integer.MIN_VALUE; int mini =0;
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        //     if(arr[i] > max) {
        //         max = arr[i]; 
        //         maxi = i;
        //     }
        //     if(arr[i] <= min) {
        //         min = arr[i]; 
        //         mini = i;
        //     }
        // }
        // if(arr[0]==max && arr[n-1]==min){
        //     System.out.println(0);
        // }else{
        //     int res = maxi+(n-1)-mini;
        
        //     if(maxi < mini)
        //         System.out.println(res);
        //     else
        //         System.out.println(res - 1);
        // }
        

        // INCOMPLETE
        // Scanner sc = new Scanner(System.in);
        // HashMap<Character,Integer> hm = new HashMap<>();
        // HashMap<Character,Integer> hm1 = new HashMap<>();
        // char s1 [] = sc.nextLine().toCharArray();
        // char s2 [] = sc.nextLine().toCharArray();
        // char s3 [] = sc.nextLine().toCharArray();
        // boolean flag = true;
        // for(char c:s1){
        //     hm.put(c,hm.getOrDefault(c,0)+1);
        // }
        // for(char c:s2){
        //     hm.put(c,hm.getOrDefault(c,0)+1);
        // } 
        // for(char c:s3){
        //     hm1.put(c,hm1.getOrDefault(c,0)+1);
        // }       
        // for (Map.Entry<Character, Integer> entry : hm1.entrySet()) {
        //     char c = entry.getKey();
        //     int count = entry.getValue(); 
        //     if(!hm1.containsKey(count)){
        //         flag = false;
        //         System.out.println(count);
        //         break;
        //     }
        // }
        // if(flag) System.out.println("YES");
        // else System.out.println("NO");
        
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int count1=0; int res1=0;
        // int count2=0;  int res2 =0;
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int q = sc.nextInt();


        // if(n==2 && q==1){
        //     System.out.print(arr[0]+" "+arr[1]);
        // }else{
        //     int qrr [] = new int[q];
        // for(int i=0;i<q;i++){
        //     qrr[i]=sc.nextInt();
        // }
        // //VASYA
        // int iter = Math.min(n,q);
        // for(int i=0;i<iter;i++){
            
        //     int query = qrr[i];
        //     if(arr[i]!=query){
        //         count1++;
        //         res1+=count1;
        //         System.out.println(res1+"res1");
        //     }else{
        //         break;
        //     }
        //     // if(arr[i]==query){
        //     //    
        //     //     res1+=count1;
        //     // }else{
        //     //     break;
        //     // }
        //   }
        // //PETYA
        // for(int i=iter-1;i>=0;i--){
            
        //     int query = qrr[i];
        //     if(arr[i]!=query){
        //         count2++;
        //         res2+=count2;
        //         System.out.println("res2"+res2);
        //     }else{
        //         break;
        //     }
        // }
        // System.out.print(res1+" "+res2);

        // }

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // String s = "YES";
        // for(int i=0;i<n;i++){
        //     String t = sc.next();

        //     if(t.equalsIgnoreCase(s)){
        //         System.out.println("YES");
        //     }else{
        //         System.out.println("NO");
        //     }
        // }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr [] = {'a','b','c'};
        for(int i=0;i<n;i++){
            char arr1[] = sc.next().toCharArray();
            int count=0;
            for(int j=0;j<3;j++){
                if(arr[j]!=arr1[j]){
                    count++;
                }
            }
            
            if(count>2) System.out.println("NO");
            else System.out.println("YES");
        }


        
    }

}

    





    

        
        


        

        
        



         

        

    


        
        
        

        
    
    
    





        
        

    

        

        
    
 

        
        
        
        
        


        

    



        


        












    



        





         
        


        
        

        


        

        
        
        


        

    


