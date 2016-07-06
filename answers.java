public String doubleChar(String str) {
  String returnString = "";
  char[] chars = str.toCharArray();
  for(int i = 0; i < chars.length; i++){
    returnString += chars[i] + "" + chars[i];
  }
  return returnString;
}

public boolean cigarParty(int cigars, boolean isWeekend) {
  if(isWeekend && cigars >= 40)
    return true;
  else if(cigars >= 40 && cigars <= 60)
    return true;
  return false;
}

public int[] rotateLeft3(int[] nums) {
  int[] returnArray = new int[3];
  returnArray[0] = nums[1];
  returnArray[1] = nums[2];
  returnArray[2] = nums[0];
  return returnArray;
}

public int[] fix23(int[] nums) {
  for(int i = 1; i < nums.length; i++){
    if(nums[i-1] == 2 && nums[i] == 3)
      nums[i] = 0;
  }
  return nums;
}

//Not working... but a start maybe
public boolean makeBricks(int small, int big, int goal) {
  if((((big * 5) - goal) <= small) && ((goal % 5) <= small) && ((goal / 5) <= big)){
    return true;
  }
  return false;
}
