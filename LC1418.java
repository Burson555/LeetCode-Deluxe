// Runtime: 92 ms, faster than 50.00% of Java online submissions for Display Table of Food Orders in a Restaurant.
// Memory Usage: 151.5 MB, less than 100.00% of Java online submissions for Display Table of Food Orders in a Restaurant.

class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        // ****************************
        HashMap<String, HashMap<String, Integer>> tables = new HashMap<>();
        TreeSet<String> foods = new TreeSet<>();
        // ****************************
        for (List<String> order : orders) {
            String table = order.get(1);
            if (!tables.containsKey(table)) 
            	tables.put(table, new HashMap<String, Integer>());
            String food = order.get(2);
            foods.add(food);
            HashMap<String, Integer> curr = tables.get(table);
            curr.put(food, 1+curr.getOrDefault(food, 0));
        }
        // ****************************
        TreeSet<Integer> ordered_tables = new TreeSet<>();
        for (String key : tables.keySet()) 
        	ordered_tables.add(Integer.parseInt(key));
        // ****************************
        List<List<String>> res = new LinkedList<>();
        List<String> temp = new LinkedList<>();
        // ****************************
        temp.add("Table");
        for (String s : foods) temp.add(s);
        res.add(temp);
        // ****************************
        for (int table_int : ordered_tables) {
            String table = Integer.toString(table_int);
            temp = new LinkedList<>();
            temp.add(table);
            for (String food : foods) 
                temp.add(Integer.toString(tables.get(table).getOrDefault(food, 0)));
            res.add(temp);
        }
        // ****************************
        return res;
    }
}
