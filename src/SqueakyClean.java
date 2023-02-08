class SqueakyClean {
    static String clean(String identifier) {
        var sb = new StringBuilder();
        boolean isCap = false;
        for (char c: identifier.toCharArray()) {
            if (c == ' ') {
                sb.append('_');
                isCap = false;
            }
            else if (c == '-')
                isCap = true;
            else if (Character.isISOControl(c))
                sb.append("CTRL");
            else if ((c < 0x3B1 || c > 0x3C9) && Character.isLetter(c)) {
                if (isCap)
                    c = Character.toUpperCase(c);
                sb.append(c);
                isCap = false;
            }
        }
        return sb.toString();
    }
}
