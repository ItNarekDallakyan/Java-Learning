package regular_expression;

public class RegExArm {
    public static void main(String[] args){
        //matches yndunum  tox cuc tal klasi mej parametr vercnum a regex
      /*
            \\d arajin regular expression esi nshanakum    (mi hat tiv) \\erku hat \\ nsahanakum vor es mer mot tar chi tiv a
            + - 1 kam aveli tver
            * - 0 kam avel tver
            ? - esi asum a 0 kam 1 element minchev

            (a|b|c)

            [a-zA-Z] -- bolor angleren tarern

           (pakagcer)  ( | | ) - stex grum en hnaravor depqer vor kara lini

           [0-9] -\\d

           [^abc]  -- menq uzum en bolor simvolnern baci a-ic b-ic c-ic

            . es asum a vor kara lini tarber simvolner

        */

        String a = "1234";
        String y = "hello";
        String text = "+1"; // demic plus dnel chi kareli
        String text1 = "-54341"; // bacasakani depqum talis a false \\ sranic araj avelacnelov - minusnernel hashvi karni

//        System.out.println(a.matches("1234"));  // veradardznum a true kam false
//        System.out.println(a.matches("1235"));  // es depqum kta false
//        System.out.println(y.matches("hello")); //es depqum klini true
        System.out.println(text1.matches("-?\\d*"));
        System.out.println(text.matches("(-|\\+)-?\\d*"));


        String d = "afgj126hfghj321531";
        System.out.println(d.matches("[a-zA-Z612]+\\d+"));


        // jxtum en string bacarelov abc=

        String iii = "asdf";
        System.out.println(iii.matches("[^abc]*"));

        String url = "http://www.google.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
    }
}