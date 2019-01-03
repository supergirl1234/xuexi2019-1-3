//String类扩展功能实现
public class Strings{

    
     /**
     * 重复某个字符
     * 
     * 例如： 
     * 'a' 5   => "aaaaa"  
     * 'a' -1  => ""
     * 
     * @param c     被重复的字符
     * @param count 重复的数目，如果小于等于0则返回""
     * @return 重复字符字符串
     */
    public static String repeat(char c, int count) {
       
	   
	  /* char[] chars=new char[100];
	   if(count>0){
		   for(int i=0;i<count;i++){
			   
			   chars[i]=c;
		
		   }
		  System.out.println(new String(chars));
	    }
        return "";*/
		
		StringBuffer sb=new StringBuffer('c');
		if(count>0){
		   for(int i=0;i<count;i++){
			   
			   sb=sb.append(c);
		
		   }
		  System.out.println(sb.toString());
	    }
		return "";
    }
    
    
     /**
     * 将已有字符串填充为规定长度，如果已有字符串超过这个长度则返回这个字符串
     * 字符填充于字符串前
     *
     * 例如： 
     * "abc" 'A' 5  => "AAabc"
     * "abc" 'A' 3  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充长度
     * @return 填充后的字符串
     */
    public static String fillBefore(String str, char filledChar, int len) {
      
	   if(str.length()>=len){
			
			System.out.println(str);
			
		}else{
			StringBuffer sb=new StringBuffer();
			StringBuffer strr=new StringBuffer(str);
			for(int i=0;i<len-strr.length();i++){
				
				sb=sb.append(filledChar);
			}
			sb.append(strr);
			System.out.println(sb);
			
			
		}
       return "";
    }
    
    /**
     * 将已有字符串填充为规定长度，如果已有字符串超过这个长度则返回这个字符串<br>
     * 字符填充于字符串后
     * 例如： 
     * "abc" 'A' 5  => "abcAA"
     * "abc" 'A' 3  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充长度
     * @return 填充后的字符串
     */
    public static String fillAfter(String str, char filledChar, int len) {
       
		if(str.length()>=len){
			
			System.out.println(str);
			
		}else{
			StringBuffer strr=new StringBuffer(str); //将String类转换为StringBuffer类
			for(int i=strr.length();i<len;i++){
				strr=strr.insert(i,filledChar);
			}
			System.out.println(strr.toString());
			
		}
			
        return "";
    }

    /**
     * 移除字符串中所有给定字符串
     * 例：removeAll("aa-bb-cc-dd", "-") => aabbccdd
     *
     * @param str         字符串
     * @param strToRemove 被移除的字符串
     * @return 移除后的字符串
     */
    public static String removeAll(CharSequence str, CharSequence strToRemove) {
        String st=str.toString();
		String stt=strToRemove.toString();
		//方法1：循环，查找到要删除的字符位置，然后删除
		while(st.contains(stt)){
			int a=st.indexOf(stt);
			int b=stt.length();
			StringBuffer strr=new StringBuffer(st);
			strr.delete(a,a+b+1);
			st=strr.toString();
		}
       return st;
		
		//方法2：用空字符串替换
		//String strr=st.replaceAll(stt,"");
		//return strr;
		
    }
    
    /**
     * 反转字符串
     * 例如：abcd => dcba
     *
     * @param str 被反转的字符串
     * @return 反转后的字符串
     */
    public static String reverse(String str) {
        
		char[] chars=str.toCharArray();
		char[] Arr=str.toCharArray();
		for(int i=chars.length-1;i>=0;i--){
			  Arr[chars.length-i-1]=chars[i];
			
		}
		//System.out.println(new String(Arr));
        return new String(Arr);
    }
	
	
	public static void main(String[] args){
		
		Strings str1=new Strings();
		System.out.print("a重复5次为：");
		str1.repeat('a',5);
		
		str1.fillBefore("abc",'A',3);
		
		str1.fillBefore("abc",'A',7);
		
		str1.fillAfter("abc",'A',2);

		str1.fillAfter("abc",'A',8);
		System.out.println("aa-bb-cc-删除'-'后为"+str1.removeAll("aa-bb-cc-","-"));
		System.out.println("aa-bb-cc-qwe删除'qwe'后为"+str1.removeAll("aa-bb-cc-qwe","qwe"));
		System.out.println("qwert反转之后为："+str1.reverse("qwert"));
		
	}

}