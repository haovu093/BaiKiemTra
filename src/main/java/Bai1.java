public class Bai1 {

    String demTu(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                count++;
        }
        System.out.println("Số từ viết in hoa trong chuỗi: " + count);
        return str;
    }

    String chuyentuInhoa(String str) {
        char[] arr = str.toCharArray();
        boolean checkSpace = true;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                if (checkSpace) {
                    arr[i] = Character.toUpperCase(arr[i]);
                    checkSpace = false;
                }
            } else {
                checkSpace = true;
            }
        }
        str = String.valueOf(arr);
        System.out.println("Chuỗi sau khi đổi: \n" + str);
        return str;
    }

}



    
    








