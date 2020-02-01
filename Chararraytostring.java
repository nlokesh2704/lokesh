class Chararraytostring
{
   public static void main(String args[])
   {
      char[] ch = {'g','d', ' ', 'm', 'o', 'r'};
      String str = new String(ch);
      System.out.println(str);
      String str2 = String.valueOf(ch);
      System.out.println(str2);
   }
}