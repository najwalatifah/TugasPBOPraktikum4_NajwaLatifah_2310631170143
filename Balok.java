package bangunruang;
class Balok extends BangunRuang {
    double length, width, height;

public Balok (double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
}

    @Override
    double calculateVolume() {
      return length * width * height;  
    }

    @Override
    double calculateSurfaceArea() {
    return 2 * (length * width + length * height + width * height);    
    }
    
}
