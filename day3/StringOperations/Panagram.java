public static void isPanagaram(String str){
    int[] freq = new int[26];
    str=str.toUppercase();
    for(int i=0;i<str.length();i++){
        freq[str.charAt(i)-65]++;
    }
    for(int i=0;i<freq.length;i++){
        if(freq[i]==0){
        return false;
        }else{
        return true;
        }
    }
    public static void main(String[] args){
        String str="john";
        StringOperations so = new StringOperations();
        System.out.println(so.isPanagaram(str));
    }
}
