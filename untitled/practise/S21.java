package practise;

public class S21 {

    public static void run(){
        /*int[] index=new int[2];
        Map<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                index[0]=i;
                index[1]=hash.get(nums[i]);
                return index;
            }
            hash.put(target-nums[i],i);
        }*/

        /*int val1,val2,count=0;
        ListNode result,temp;
        while(l1!=null||l2!=null){
            val1=val2=0;
            if(l1!=null){
                val1=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                val2=l2.val;
                l2=l2.next;
            }
            count=val1+val2+count;
            if(result==null) {
                temp = result = new ListNode(count % 10);
            }
            else{
                temp.next=new ListNode(count%10);
                temp=temp.next;
            }
            count=count<10?0:1;
        }
        return result;*/

        /*String s="ckilbkd";
        char[] chars=s.toCharArray();
        if(chars.length==0)return 0;
        if(chars.length==1)return 1;
        boolean tag1,tag2;
        Map<Character,Integer> map=new HashMap<>();
        int i,j,center= chars.length/2;
        map.put(chars[center],0);
        i=center-1>=0?center-1:center;
        j=center+1< chars.length?center+1:center;
        while(i>-1&&j< chars.length){
            tag1=map.containsKey(chars[i]);
            tag2=map.containsKey(chars[j]);
            if(tag1&&tag2)break;
            if(!tag1){
                map.put(chars[i],0);
                if(i>=1)i--;
            }
            if(!tag2){
                map.put(chars[j],0);
                if(j<chars.length-1)j++;
            }
        }
        return map.size();*/

        /*String s;
        int left,right,max,length=s.length();
        left=right=max=0;
        char ch;
        Map<Character,Integer> map=new HashMap<>();
        while(right<length){
            ch=s.charAt(right);
            if(map.containsKey(ch))
                left=map.get(ch)+1;
            max=Math.max(max,right-left+1);
            map.put(ch,right);
            ++right;
        }*/

        /*String s="abba";
        int left,right,max,length=s.length();
        left=right=max=0;
        char ch;
        Map<Character,Integer> map=new HashMap<>();
        while(right<length){
            ch=s.charAt(right);
            if(map.containsKey(ch))
                left=map.get(ch)+1;
            max=Math.max(max,right-left+1);
            map.put(ch,right);
            ++right;
        }
        System.out.println(max);
        Integer integer;integer.toString().toCharArray();
        char[] chars=String.valueOf(left).toCharArray();
        int n= chars.length;;
        for(int i=0;i<n;i++){
            if(chars[i]!=chars[n-i-1])
                return false;
        }
        return true;*/

        /*String[] strs;
        Arrays.sort(strs);
        int n= strs.length;
        StringBuilder fl=new StringBuilder("");
        for (int i=0;i<strs[0].length();i++){
            if (strs[0].charAt(i)==strs[n-1].charAt(i))
                fl.append(strs[0].charAt(i));
        }
        return fl.toString();*/

        /*String s="()";
        List<Character> c=new ArrayList<>();
        for(int i=0,index=0;i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(') {
                c.add(index++,s.charAt(i));
                continue;
            }
            if(index-1>=0&&(s.charAt(i)=='}'&&c.get(index-1)=='{')||
                    (s.charAt(i)==')'&&c.get(index-1)=='(')||
                    (s.charAt(i)==']'&&c.get(index-1)=='[')){
                c.remove(--index);
                continue;
            }

            //return false;
        }
        //return true;*/
        /*
        ListNode list1,list2;

        ListNode result,temp;
        while(list1!=null||list2!=null){
            if(list1==null&&list2==null)break;
            if (result==null)
                result=temp=new ListNode();
            else
            {
                temp.next=new ListNode();
                temp=temp.next;
            }
            if(list1==null)
            {
                temp.val= list2.val;
                list2=list2.next;
            }
            else {
                if (list2==null){
                    temp.val= list1.val;
                    list1=l.next;
                }
                else {
                    if(list1.val< list2.val){
                        temp.val= list1.val;
                        list1=list1.next;
                    } else if (list1.val> list2.val) {
                        temp.val= list2.val;
                        list2=list2.next;
                    }
                    else {
                        temp.val=list1.val;
                        temp.next=new ListNode(list1.val);
                        temp=temp.next;
                        list1=list1.next;
                        list2=list2.next;
                    }
                }
            }
        }*/





    }
}
