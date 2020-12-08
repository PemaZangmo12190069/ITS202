public class SeparateChainingHashSTTest {
    public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        st.put("Pema",4);
        st.put("Zangmo",6);
        st.put("Samten",2);
        st.put("Wangmo",5);
        st.put("Karma",11);
        st.put("Yangzom",1);
        st.put("Thinley",0);
        st.put("Wangmo",3);
        st.delete("Wangmo");

        System.out.println(st.get("Pema"));
        System.out.println(st.get("Thinley"));
        System.out.println(st.get("Samten"));
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.contains("Karma"));

        assert(st.isEmpty() == false);
        assert(st.size() == 8);
        System.out.println("All Test Cases Passed.");
    }

}