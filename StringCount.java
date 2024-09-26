//Ունեք սովորական String փոփոխական, որի մեջ անգլերեն տառերով տեքստա գրած պրոբելներով։։
// Դուք պիտի գրեք մեթոդ, որը կստանաս տվյալ String-ը որպես պարամետր ու կվերադարձնի String-ում բառերի քանակը։
//Բառ համարվումա ցանկացած մինիմում >=1 տառ(եր)ի հաջորդականությունը
//Պրոբելների քանակը կարա լինի 1-ից ավել տեքստի մեջ ցանկացած 2 բառի արանքում
//    Լուծումը ստուգում եք տարբեր տեսքի տեքստերի համար։
//    Ծրագիրը պիտի իտերացիա անի String-ի վրա, String-ի ստանդարտ մեթոդներից
//    կարաք օգտագործեք իտերացիա անելու համար անհրաժեշտները՝ String-ի երկարությունը վերցնելու
//    մեթոդն ու հերթական ինդեքսի տակ գտնվող տառը վերցնելու համար նախատեսված մեթոդը, ոչ ավելին։
public class StringCount {
    public static void main(String[] args) {
        String text = "This is text  that has to be checked";
        System.out.println(wordSum(text));

    }

    static int wordSum(String text) {
        int wordCount = 0;
        boolean character = false;
        for (int i = 0; i < text.length(); i++) {
            char currentchar = text.charAt(i);
            if (currentchar != ' ') {
                if (!character) {
                    wordCount++;
                    character = true;
                }
            } else {
                character = false;
            }
        }
        return wordCount;
    }
}