public class WhoLikesIt {

    public static String whoLikesIt(String... names) {
        StringBuilder sb = new StringBuilder();


        if (names.length == 0){
            sb.append("no one likes this");
        }

        for (int i = 0; i < names.length ; i++) {
            if (names.length == 1){
                sb.setLength(0);
                sb.append(names[i] + " " + "likes this");
            }
            if (names.length == 2){
                sb.setLength(0);
                sb.append(names[0] + " " + "and" + " " + names[1] + " " + "like this");
            }
            if (names.length == 3){
                sb.setLength(0);
                sb.append(names[0] + ", " + names[1] + " " + "and" + " " + names[2] + " " + "like this");
            }
            if (names.length > 3){
                int length = names.length - 2;
                sb.setLength(0);
                sb.append(names[0] + ", " + names[1] + " " + "and" + " " + length + " " + "others like this");
            }
        }


        return sb.toString();
    }
}
