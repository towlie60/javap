package Set;

import java.util.*;

public class ListToSet {

    public static void main(String[] args) {
        //How to remove duplicates from a List

        List<Integer> nums = new ArrayList<>();
        nums.add(13243);
        nums.add(435);
        nums.add(54);
        nums.add(23);
        nums.add(435);
        nums.add(4567);


        Set<Integer> uniqueNums = new HashSet<>();



        uniqueNums.addAll(nums);

//        for(Integer n : nums) {
//            uniqueNums.add(n);
//        }

               for (int i = 0; i < nums.size(); i++) {
  //          uniqueNums.add(nums.get(i));
        }
        System.out.println(uniqueNums);

        //Like Lists we can copy the contents of
        //different collections.
        Set<Integer> uniqueNums2 = new HashSet<>(nums); // more preferred and shorter
        System.out.println(uniqueNums2);

        List<Integer>nums2 = new ArrayList<>(uniqueNums2);
        System.out.println(nums2);

   Set<Integer> num3 =new HashSet<>();
        num3.add(243);
        num3.add(112);
        num3.add(22);
        num3.add(241243);
        //AddAll is adding on top of what the set already has
        num3.addAll(uniqueNums2);



    }
}
//
//        //Like Lists we can copy the contents of
//        //different collections
//        Set<Integer> uniqueNums2 = new HashSet<>(nums);
//        System.out.println(uniqueNums2);
//
//        List<Integer> nums2 = new ArrayList<>(uniqueNums2);
//        System.out.println(nums2);
//    }
//}
