class Solution {
    public int[] plusOne(int[] A) {
        int carry = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=A.length-1;i>0;i--){
            
            int sum = carry+A[i];
            if(sum >=10)
            {
                carry = sum/10;
                ans.add(sum%10);
            }
            else{
                carry = 0;
                ans.add(sum);
            }
        }
            if(carry == 0)
            {
                ans.add(A[0]);
            }
            else
            {
                ans.add((carry+A[0]) % 10);
                ans.add((carry+A[0]) / 10);
            }
            int arr[] = new int [ans.size()];
            int k=0;
            int s = 0;
             for(int i=ans.size()-1;i>=0;i--){
                arr[k++] = ans.get(i);
            } 
        for(int i=0;i<arr.length;i++)
          {
              if(arr[i] == 0)
              s++;
              else
              break;
          }
          int p=0;
          int fans[] = new int [arr.length-s];
          for(int i=s;i<arr.length;i++)
          fans[p++] = arr[i];
            return fans;
    }
}