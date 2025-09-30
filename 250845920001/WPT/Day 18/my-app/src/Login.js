import { useState } from "react";

const Login = ()=>{
    const [formData, setFormData] = useState({username: "", password: "" });
    const [submittedData, setSubmittedData] = useState(null);

    const handleChange = (e)=>{
        setFormData({...formData, [e.target.name]: e.target.value});
    };

    const handleSubmit = (e)=>{
        e.preventDefault();
        setSubmittedData(formData);
    };

    return(
        <div>
            <h2>Login Form</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>username:{" "}
                        <input 
                            type="text" name="username" 
                            value={formData.username} 
                            onChange={handleChange}
                            required
                        ></input>
                    </label>
                </div>

                <div>
                    <label>password:{" "}
                        <input 
                            type="password" name="password" 
                            value={formData.password} 
                            onChange={handleChange}
                            required
                        ></input>
                    </label>
                </div>

                <div>
                    <button type="submit"> Submit </button>
                </div>
            </form>

            {submittedData && (
                <div>
                <p>username: {submittedData.username}</p>
                <p>password: {submittedData.password}</p>
            </div>
            )}
            

        </div>
    )
}

export default Login;