import React from "react";
import { Typography, Button } from "@mui/material";
import { Link } from "react-router-dom";
import "../App.css"

const Home = () => {
  return (
    <div>
      <Typography sx={{ margin:"5%" }} variant="h3" align="center">
        JobQuest - Get Hired or Hire people
      </Typography>
      <div style={{textAlign : 'center'}}>
        <ul className="ul">
          <li>
          <Button sx={{ margin:"2% 3%"}} variant="contained">
            <Link style={{textDecoration : 'none', color: 'white'}} to="/employer/dashboard">
              Hire talent
            </Link>
            </Button>
          </li>
          <li>
          <Button sx={{ margin:"2% 3%"}} variant="contained">
            <Link style={{textDecoration : 'none', color: 'white'}}  to="/employee/feed">
              Get Job Now
            </Link>
            </Button>
          </li>
        </ul>
      </div>
    </div>
  );
};

export default Home;
