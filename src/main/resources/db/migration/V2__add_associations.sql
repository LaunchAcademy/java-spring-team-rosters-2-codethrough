ALTER TABLE players
ADD COLUMN team_id INTEGER NOT NULL REFERENCES teams(id);