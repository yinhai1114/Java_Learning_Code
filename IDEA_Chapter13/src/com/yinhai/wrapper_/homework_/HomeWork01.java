public class HomeWork01 {
    public static void main(String[] args) {
        String str = "0123456789";
        //改变的是char，和str无关
        try {
            System.out.println(reverse(str,1,5));//0543216789
            System.out.println(reverse(str,4,5));//0123546789
            System.out.println(reverse(str,2,5));//0154326789
            System.out.println(reverse(str,7,5));//0154326789
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        //想改变str直接str = rever(str,start,end);即可
    }
    public static String reverse(String str,int start,int end){
        //需要对输入的参数做一个验证
        if(!(str.length() > end && end > start && start > 0 && str!=null)){
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();//返回的是new的
        char temp;
        for (int i = 0; i < (end - start) / 2 + 1; i++) {
            if(start + i == end + i){
                break;
            }
            temp = chars[start + i];
            chars[start + i]= chars[end - i];
            chars[end - i] = temp;
        }

        String str1 = String.valueOf(chars);
        return str1;
    }
}
