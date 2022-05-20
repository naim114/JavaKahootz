# JavaKahootz

### Prerequisite
- json-simple
// How to add to project (Apache Netbeans)
1. Download at https://code.google.com/archive/p/json-simple/downloads
2. Right click project and choose Properties
3. At Libraries section, click + at Classpath then choose downloaded jar file
4. Click OK

### Storing Data
- Data were store at text file
- Data stored using JSON format
- Each 'table' has it own text file

### Data Structure
Data table is as follow;

#### User
- Data field: String username, String password
- Sample data: [{"password":"pass","username":"admin"}, {"password":"user","username":"user_1"}]
- Admin is the only user can edit or delete other user
