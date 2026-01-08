void main() {
    String str = "swiss";
    LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
    for (char ch : str.toCharArray()) {
        linkedHashMap.put(ch, linkedHashMap.getOrDefault(str.toCharArray(), 0) +1);
    }
    linkedHashMap.entrySet().stream()
            .filter(entry-> entry.getValue() == 1 )
            .findFirst().ifPresent(IO::println);
    System.out.println("Only Value.......");

    linkedHashMap.entrySet().stream()
            .filter(entry-> entry.getValue() == 1 )
            .findFirst().ifPresent(a -> IO.println(a.getValue()));
}