public class Stock {

    String company_name;
    String company_symbol;
    double year_low;
    double year_high;
    double current_price;

    public String get_name() {
        return this.company_name;
    } // End get_name() method

    public String get_symbol() {
        return this.company_symbol;
    } // End get_symbol() method

    public double get_year_low() {
        return this.year_low;
    } // End get_year_low() method

    public double get_year_high() {
        return this.year_high;
    } // End get_year_high() method


} // End Stock class