# restfulBookerGatling
#Test Case
<ol>
<li>Pause first</li> 
<li>Injects a 10 number of users at once</li>
<li>Injects a 400 of users distributed evenly on a time window of a 10 duration</li>    
<li>use statistics calculated for each individual request</li>
<ol>
  <li>check successful Requests in 95percentil</li>
  <li>check that the mean (average) response time of all requests is less than or equal to 500 milliseconds</li>
</ol>
</ol>



Tests based on free API from https://restful-booker.herokuapp.com/apidoc/index.html <br />
Gatling used in open source version <br />
Is an example of a very simple performance test.<br />

The simulation is started with a command 
```
-clean scala:compile gatling:test -Dgatling.simulationClass.SimulationUser
```
Results can be found in\restfulbookergatling\target\gatling\simulationuser<br />

![image](https://github.com/anniab/restfulBookerGatling/assets/73132236/1ece69ff-66b4-4609-abbd-3d5b1a99d478)<br />
In the Report there are exact statistics from the tests, statistics from a requests simulation can also be found in the simulation.log file<br />

it's important to know that:<br />
<ul>
<li>The API https://restful-booker.herokuapp.com/apidoc/index.html is not stable</li>
<li>This test is for illustrative purposes only and does not reflect tests performed under production conditions 
there is not a lot of load and it is very short given that it is a public API, long tests and heavy load it could be considered a DDoS attack</li>
<li>The test approach is very simplified for this API, no KPIs</li>
 </ul>

How could these tests be extended?<br />
<ul>
<li>business scenario could be introduced</li>
<li>adding random data</li>
<li>differentiate the approach to the test due to the type of POST / GET method etc.</li>
<li>add additional elements, more assertions</li>
</ul>
