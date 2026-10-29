### Definitions:
**proxy -**
	**- smart_proxy:**

**thread-per-request -** 

**caching -** 

**Load balancing -** 

**Round robin -** 


------------------------
### **BasePipeline**:

[Client] -> [Smart_Proxy] -> [Data_Warehouse_1] -> [Data_Warehouse_N] -> [DB]

-----------------
### Lab:

**CVE Database:**
	cveId: UUID [no-null]
	versionName: String [no-null]
	threatLevel: Enum [no-null]  / [default: low]
	description: String  [no-null]
	author: String [null]

[Client] -> [Smart_Proxy_CVE] -> [Data_Warehouse_1]  |
						   | [Data_Warehouse_N]  -> [CassandraDB] 

