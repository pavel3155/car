public interface glass {
    default String upGlass(){
        return "окно закрыто";
    }
    default String downGlass(){
        return "окно открыто";
    }
}
